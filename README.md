# Hibernate Practice #

This repo is for practicing hibernate along with postgres and spring boot.

## Build ##

To build the project run

    ./gradlew build
        
Note that this only works on macOS.

It will ensure postgres is installed and running and has a database that can be
connected to by the spring boot app.

## Database ##

The database for this project is postgres.

The password for the database is automatically generated and is stored in:

    .postgrespw
    src/test/resources/dbpassword.properties
    
Neither of them are committed and are ignored.

If for whatever reason the database becomes corrupted or unusable it can be
wiped by

    rm -rf /usr/local/var/postgres
    
Rerunning the build will setup a new database cluster.

# Licence #

This software is MIT licenced. See [LICENCE](LICENCE).