#! /bin/bash

docker run --name athyg-db --hostname=athyg-db --network=interna \
--restart=always \
-e POSTGRES_USER=postgres \
-e POSTGRES_PASS=admin \
-e POSTGRES_DBNAME=athyg \
-e ALLOW_IP_RANGE='0.0.0.0/0' \
-p 36932:5432 \
-v /etc/localtime:/etc/localtime:ro \
-v /srv/athyg-db/:/var/lib/postgresql/ \
-d kartoza/postgis:14-3.3


