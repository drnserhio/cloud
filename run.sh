./gradlew :gateway:clean
./gradlew :user-servic:clean

./gradlew :gateway:build
./gradlew :user-service:build

docker-compose up --build
