# spring-cloud-learning

## consul install
```shell
docker pull consul:1.15.2

docker volume create consul-data

docker run -d --name=consul -p 8500:8500 -p 8600:8600/udp -v consul-data:/consul/data consul:1.15.2 agent -server -ui -node=server-1 -bootstrap-expect=1 -client=0.0.0.0
```

## nacos
```shell
sh startup.sh -m standalone
```
http://localhost:8848

## sentinel
```shell
java -jar sentinel-dashboard-1.8.6.jar
```
http://localhost:8080

sentinel/sentinel