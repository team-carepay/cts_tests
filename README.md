# Claims API (Spring Boot + MySQL + Liquibase)

Simple demo API with two entities: `Claim` (has many) `ClaimItem`. Both have a `status`.

```bash
mvn spring-boot:run
```

## REST Endpoints

### Create Claim with Items

`POST /api/claims`

```json
{
  "policyNumber": "POL-123",
  "claimantName": "Jane Doe",
  "status": "OPEN",
  "items": [
    {
      "description": "Screen replacement",
      "amount": 120.50,
      "status": "PENDING"
    },
    {
      "description": "Battery",
      "amount": 40.00,
      "status": "APPROVED"
    }
  ]
}
```

### Get Claim by Id (with items)

`GET /api/claims/{id}`

## Notes

- Lombok annotations used for boilerplate elimination.
- Schema is managed by Liquibase.
- Runs with MySQL 8 in Docker.

# Your tasks are as follows.

Fork this repo, and make sure to work ina branch. You will submit you work as a PR against the master branch to allow
reviewers to compare your changes with the master branch. DO NOT merge. your work to the master branch.
Generally, this project has many bugs you need to find and fix after you've implemented the changes above.

1. Complete implement the addItem controller method with the below spec

### Add Item to Claim

`POST /api/claims/{id}/items`

```json
{
  "description": "Back cover",
  "amount": 25.00,
  "status": "PENDING"
}
```

Bonus points for integration test for the addItem API and unit tests.

2. Using liquibase changelog that is already configured, create database tables Claim and ClaimItem
3. Create a new liquibase changeset and use it to ingest sample data for the tables. test the `/api/claims/{id}` to get
   the sample data as json.
4. Ensure your project is running successfully.