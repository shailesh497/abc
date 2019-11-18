export class Menu{

public static menu:Array<any>=[
{
    oe:[
        { path: 'oedash', title: 'Dashboard',  class: '' },
        { path: 'oeloanprocess', title: 'OELoanProcess', class: '' },
        
        { path: 'loan-generation', title: 'Loan Generation',  class: '', 
        submenu: [
            { path: 'customer-details', title: 'Customer Details',  class: ''},
            { path: 'loan-details', title: 'Loan Details',  class: ''},
            { path: 'guaranter-details', title: 'guaranter Details', class: ''}
        ]
    }
    ],
    re:[
        { path: 'redash', title: 'Dashboard',  icon: 'dashboard', class: '' },
        { path: 'reloanprocess', title: 'RELoanProcess',  icon: 'dashboard', class: '' },

    ]
}

]
}