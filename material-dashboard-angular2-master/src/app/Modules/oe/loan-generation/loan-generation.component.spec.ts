import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoanGenerationComponent } from './loan-generation.component';

describe('LoanGenerationComponent', () => {
  let component: LoanGenerationComponent;
  let fixture: ComponentFixture<LoanGenerationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoanGenerationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoanGenerationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
