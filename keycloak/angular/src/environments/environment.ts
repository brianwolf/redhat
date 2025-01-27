export const environment = {
    keycloak: {
        url: 'http://localhost:9091',
        redirectUri: 'http://localhost:4200',
        postLogoutRedirectUri: 'http://localhost:4200/logout',
        realm: 'caja-ande',
        clientId: 'front',
    }, 
};
