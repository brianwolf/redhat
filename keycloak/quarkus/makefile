APP_NAME=quarkus
VERSION=1.0.0-SNAPSHOT

dev:
	./mvnw quarkus:dev

c compile:
	./mvnw install -Dnative -DskipTests -Dquarkus.native.container-build=true

l linux:
	./target/$(APP_NAME)-$(VERSION)-runner
