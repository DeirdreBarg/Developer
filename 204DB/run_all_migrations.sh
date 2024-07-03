#!/bin/bash

# Directory containing the SQL files
MIGRATIONS_DIR="./migrations"

# SQLite database file
DATABASE="my_database.db"

# Loop through all .sql files in the migrations directory
for sql_file in "$MIGRATIONS_DIR"/*.sql; do
    echo "Running migration: $sql_file"
    sqlite3 "$DATABASE" < "$sql_file"
done