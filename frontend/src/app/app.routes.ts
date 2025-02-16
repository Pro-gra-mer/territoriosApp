import { Routes } from '@angular/router';

import { AddComponent } from './components/add/add.component';
import { EditComponent } from './components/edit/edit.component';
import { ReturnComponent } from './components/return/return.component';
import { DisponiblesComponent } from './components/disponibles/disponibles.component';

export const routes: Routes = [
  { path: 'disponibles', component: DisponiblesComponent },
  { path: 'return', component: ReturnComponent },
  { path: 'add', component: AddComponent },
  { path: 'edit', component: EditComponent },
  { path: '**', redirectTo: '' }, // Redirección si la ruta no existe
];
