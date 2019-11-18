import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OEDashboardComponent } from './oedashboard/oedashboard.component';
import { RouterModule, Routes } from '@angular/router';
import { LoanGenerationComponent } from './loan-generation/loan-generation.component';
import { CustomerDetailsComponent } from './loan-generation/customer-details/customer-details.component';
import { LoanDetailsComponent } from './loan-generation/loan-details/loan-details.component';
import { GuaranterDetailsComponent } from './loan-generation/guaranter-details/guaranter-details.component';
import { MatInputModule } from '@angular/material';
import { FormsModule } from '@angular/forms';
import { GuaranterViewDetailsComponent } from './loan-generation/guaranter-view-details/guaranter-view-details.component';
import {MatCardModule} from '@angular/material/card';
const oerouting: Routes = [
  { path: 'oedash', component: OEDashboardComponent },
  { path: 'loan-generation', component: LoanGenerationComponent },
  { path: 'customer-details', component: CustomerDetailsComponent},
  { path: 'guaranter-details', component:GuaranterDetailsComponent },
  { path: 'guaranter-view-details', component:GuaranterViewDetailsComponent}
]


@NgModule({
  declarations: [OEDashboardComponent, LoanGenerationComponent, CustomerDetailsComponent, LoanDetailsComponent, GuaranterDetailsComponent,  GuaranterViewDetailsComponent],
  imports: [
    FormsModule,
    CommonModule,
    MatInputModule,
    MatCardModule,
    RouterModule.forChild(oerouting)
  ],
  exports: [OEDashboardComponent,LoanGenerationComponent, CustomerDetailsComponent, LoanDetailsComponent,GuaranterDetailsComponent]
})
export class OEModule { }
