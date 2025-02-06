# ------------------------------------------
# VARIABLES
# ------------------------------------------

BACKEND_URL=http://localhost:8080
KEYCLOAK_URL=http://localhost:9090
CLIENT_ID=back
CLIENT_SECRET=QBCh7bLJmGe8N8UJJQc6x1tifKkqDK5W


# ------------------------------------------
# SCRIPT
# ------------------------------------------

token=$(curl -s -k --location \
    "$KEYCLOAK_URL/realms/caja-ande/protocol/openid-connect/token" \
    --header 'content-type: application/x-www-form-urlencoded' \
    --data-urlencode "client_id=$CLIENT_ID" \
    --data-urlencode "client_secret=$CLIENT_SECRET" \
    --data-urlencode 'grant_type=client_credentials' | jq -r '.access_token')

curl -s -k -v --location \
    "$BACKEND_URL/api/users/me" \
    --header "Authorization: Bearer $token"