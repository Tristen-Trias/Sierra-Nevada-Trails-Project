#Make some tests

db="proj.sqlite"

sqlite3 $db < drop.sql
sqlite3 $db < create-tables.sql
sqlite3 $db < fillTables.sql

sqlite3 $db < test.sql