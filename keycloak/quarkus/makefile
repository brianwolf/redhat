APP_NAME=quarkus
VERSION=1.0.0-SNAPSHOT

dev:
	./mvnw quarkus:dev

c compile:
	./mvnw install -Dnative -DskipTests -Dquarkus.native.container-build=true

l linux:
	./target/$(APP_NAME)-$(VERSION)-runner


db docker-build:
	docker build . -t caja-ande/$(APP_NAME):$(VERSION)
	# docker build . -t caja-ande/$(APP_NAME):$(VERSION) -f src/main/docker/Dockerfile.jvm


caja-ande:
	docker build . -t docker.io/brianwolf94/cajaande-back:1.0.0 && docker push docker.io/brianwolf94/cajaande-back:1.0.0