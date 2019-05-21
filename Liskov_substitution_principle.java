//1/ The code that violates the principle.

class Employee
{
    ...
 
    int countSocialinsurance()
    {
    }
}
 
class OfficialEmployee extends Employee
{
    int countSocialinsurance()
    {
       return this.salary - (this.salary*15/100);
    }
}

class ParttimeEmployee extends Employee
{
    int countSocialinsurance()
    {
       return this.salary - (this.salary*10/100);
    }
}
 
class InternEmployee extends Employee
{
    int countSocialinsurance()
    {
        throw Exception("Not Allowed Action!!!");
    }
}


//2/ The code to fix that violation.

class Employee
{
    ...
}
 
interface EmployeeMustPayTax
{
    int countSocialinsurance();
}

class OfficialEmployee extends Employee implements EmployeeMustPayTax
{
    int countSocialinsurance()
    {
       return this.salary - (this.salary*15/100);
    }
}

class ParttimeEmployee extends Employee implements EmployeeMustPayTax
{
    int countSocialinsurance()
    {
       return this.salary - (this.salary*10/100);
    }
}
 
class InternEmployee extends Employee
{
    ...
}