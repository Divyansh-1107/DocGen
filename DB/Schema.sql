-- Company details
CREATE TABLE Companies (
    CompanyID SERIAL PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    ShortName VARCHAR(255),
    RegistrationNumber VARCHAR(255) UNIQUE,
    TINNumber VARCHAR(255) UNIQUE,
    PANNumber VARCHAR(255) UNIQUE,
    GSTIN VARCHAR(255) UNIQUE,
    IEC VARCHAR(255) UNIQUE,
    Phone VARCHAR(20),
    Email VARCHAR(255),
    Logo VARCHAR(255),
    Website VARCHAR(255)
);

-- Company addresses
CREATE TABLE CompanyAddresses (
    AddressID SERIAL PRIMARY KEY,
    CompanyID INT NOT NULL,
    Address VARCHAR(255) NOT NULL,
    AddressType VARCHAR(50), -- e.g., Billing, Shipping, etc.
    FOREIGN KEY (CompanyID) REFERENCES Companies(CompanyID)
);

-- Users who can create or request documents
CREATE TABLE Users (
    UserID SERIAL PRIMARY KEY,
    Username VARCHAR(255) NOT NULL,
    Email VARCHAR(255) NOT NULL UNIQUE,
    PasswordHash CHAR(64) NOT NULL,
    CreatedAt TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- Templates for generating documents
CREATE TABLE Templates (
    TemplateID SERIAL PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    Content TEXT NOT NULL, -- Storing the template content, possibly in a markup language
    CreatedBy INT NOT NULL,
    CreatedAt TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (CreatedBy) REFERENCES Users(UserID)
);

-- Generated documents
CREATE TABLE Documents (
    DocumentID SERIAL PRIMARY KEY,
    TemplateID INT NOT NULL,
    GeneratedBy INT NOT NULL,
    Content TEXT NOT NULL, -- The final content of the generated document
    CreatedAt TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (TemplateID) REFERENCES Templates(TemplateID),
    FOREIGN KEY (GeneratedBy) REFERENCES Users(UserID)
);

-- Optional: Document metadata for additional properties
CREATE TABLE DocumentMetadata (
    MetadataID SERIAL PRIMARY KEY,
    DocumentID INT NOT NULL,
    Key VARCHAR(255) NOT NULL,
    Value TEXT NOT NULL,
    FOREIGN KEY (DocumentID) REFERENCES Documents(DocumentID)
);