import { Component, OnInit } from '@angular/core';
import { GuarantorDetails } from 'app/model/GuarantorDetails';
import { SharedService } from 'app/shared/shared.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-guaranter-view-details',
  templateUrl: './guaranter-view-details.component.html',
  styleUrls: ['./guaranter-view-details.component.scss']
})
export class GuaranterViewDetailsComponent implements OnInit {

  guaranterDetails: GuarantorDetails = {
    g_id: null,
    g_name: '',
    g_p_id: '',
    g_p_value: '',
    g_s_id: '',
    g_s_value: '',
    g_mobileno: '',
    g_emailid: '',
    g_address: '',
    g_occupation: '',
    g_gender: '',
    g_dob: ''
  }





  constructor(private service: SharedService, private routes: Router) { }

  ngOnInit() {
    this.guaranterDetails = JSON.parse(sessionStorage.getItem('details'));
    console.log(this.guaranterDetails);

  }

  save(data: GuarantorDetails) {
    console.log(data);
    this.guaranterDetails = data;
    this.service.saveData(data).subscribe();
  }
}
