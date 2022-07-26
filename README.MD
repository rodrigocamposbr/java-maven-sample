# Commands Used

send artifact to private registry

* mvn deploy -DskipTests -Dmaven.install.skip=true

Run database

* docker run --name postgres -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=password -e POSTGRES_DB=MYDATABASE -p 5432:5432 -d postgres:9.1.19

run liquibase

* mvn liquibase:update
