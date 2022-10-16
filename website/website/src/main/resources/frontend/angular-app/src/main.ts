import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { environment } from './environments/environment';
import {test} from "./app/app.module";

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(test)
  .catch(err => console.error(err));
