# 

## Model
www.msaez.io/#/storming/google_drive_hakhyun2

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- PostUploadSection
- StreamingSection
- UploadSection(Core)
- DashBoardSection
- notification


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- PostUploadSection
```
 http :8088/indexInfos id="id" index_yn="index_yn" file_id="file_id" keyword="keyword" 
```
- StreamingSection
```
 http :8088/streamInfos id="id" full_file_name="full_file_name" file_type="file_type" connet_url="connet_url" 
```
- UploadSection(Core)
```
 http :8088/files id="id" user_id="user_id" upload-ymd="upload-ymd" full_file_name="full_file_name" file_url="file_url" file_type="file_type" file_size="file_size" 
```
- DashBoardSection
```
```
- notification
```
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

