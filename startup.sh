#!/bin/sh
if [ -z "$KUBERNETES_MASTER" ]; then
  if [ -n "$KUBERNETES_SERVICE_HOST" ] && [ -n "$KUBERNETES_SERVICE_PORT" ]; then
    export KUBERNETES_MASTER=${KUBERNETES_SERVICE_HOST}:${KUBERNETES_SERVICE_PORT}
  fi
fi
if [ -n "$MYSQL_CONFIG_LOC" ]; then
  export MYSQL_TRUST_STORE="-Djavax.net.ssl.trustStore="${MYSQL_CONFIG_LOC}/$(cat ${MYSQL_CONFIG_LOC}/trust.file.name)
  export MYSQL_TRUST_STORE_PASSWORD="-Djavax.net.ssl.trustStorePassword="$(cat ${MYSQL_CONFIG_LOC}/trust.file.password)
fi
java "$MYSQL_TRUST_STORE" "$MYSQL_TRUST_STORE_PASSWORD" -jar -cp .:./app.jar
