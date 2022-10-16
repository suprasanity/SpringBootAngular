export class User {
  private name :String;
  private prenom :String;
  private  email : String;
  private  date_naissance: Date;
  private mdp : String;

  constructor(name:String,prenom:String,email:String,date_naissance:Date,mdp:String) {
    this.name=name;
    this.prenom=prenom;
    this.email=email;
    this.date_naissance=date_naissance;
    this.mdp=mdp;
  }
  public toString():String{
    return " nom :"+this.name + " prenom : "+ this.prenom + " mail : "+this.email+ " née le : "+ this.date_naissance + " mdp : "+ this.mdp;
  }

}
