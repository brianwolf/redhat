import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Router, RouterStateSnapshot } from '@angular/router';
import { KeycloakAuthGuard, KeycloakService } from 'keycloak-angular';

@Injectable({
    providedIn: 'root',
})
export class AppAuthGuard extends KeycloakAuthGuard {

    constructor(protected override router: Router, protected keycloak: KeycloakService) {
        super(router, keycloak);
    }

    isAccessAllowed(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Promise<boolean> {

        return new Promise(async (resolve, reject) => {

            // if (!this.authenticated) {
            //     await this.keycloak.login();
            // }

            resolve(this.authenticated);
        });
    }
}