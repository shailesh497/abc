import { Component, OnInit } from '@angular/core';
import { GuarantorDetails } from 'app/model/GuarantorDetails';
import { SharedService } from 'app/shared/shared.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-guaranter-details',
  templateUrl: './guaranter-details.component.html',
  styleUrls: ['./guaranter-details.component.scss']
})
export class GuaranterDetailsComponent implements OnInit {

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

  constructor(private service: SharedService, private routes:Router) { }

  ngOnInit() {
  }


  getdata(data: GuarantorDetails) {
    console.log(data.g_p_id);

  }

  save(data: GuarantorDetails) {
    console.log(data);
    this.service.saveData(data).subscribe();
  }

  PreviewData(data:GuarantorDetails){
    console.log(data);
    this.guaranterDetails=data;
    sessionStorage.setItem('details',JSON.stringify(this.guaranterDetails));
    this.routes.navigateByUrl('role/oe/guaranter-view-details');
  }

}


