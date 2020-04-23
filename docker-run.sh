APP_PATH=/home/gilmario/mock-api
APP_NAME=mock-api

cd $APP_PATH

git fetch origin
git reset --hard origin/master

docker run -it --rm \
    -v "$APP_PATH":/usr/src \
    -v "/home/gilmario/.m2":"/root/.m2" \
    -w /usr/src maven:3.5-jdk-8 mvn clean package -DskipTests=true

docker rm -f mock-api

docker run -d \
    -v "$APP_PATH/target":"/usr/src" \
    -w /usr/src \
    --name $APP_NAME \
    -p 8181:8080 \
    openjdk:8-jre java -jar \
    -Djava.net.preferIPv4Stack=true -Duser.language=pt-BR MockApi-1.0.0-SNAPSHOT.jar
