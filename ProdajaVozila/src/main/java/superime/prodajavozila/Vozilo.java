package superime.prodajavozila;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Vozilo")
public class Vozilo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("VoziloID")
   private java.lang.Long voziloID;
   @org.kie.api.definition.type.Label("Vrsta")
   private java.lang.String vrsta;
   @org.kie.api.definition.type.Label("Model")
   private java.lang.String model;

   @org.kie.api.definition.type.Label(value = "Motor")
   private java.lang.String motor;

   @org.kie.api.definition.type.Label(value = "Oprema")
   private java.lang.String oprema;

   @org.kie.api.definition.type.Label(value = "Dodatna oprema")
   private java.lang.String dodatnaOprema;

   @org.kie.api.definition.type.Label(value = "VIN")
   private java.lang.String VIN;

   public Vozilo()
   {
   }

   public java.lang.Long getVoziloID()
   {
      return this.voziloID;
   }

   public void setVoziloID(java.lang.Long voziloID)
   {
      this.voziloID = voziloID;
   }

   public java.lang.String getVrsta()
   {
      return this.vrsta;
   }

   public void setVrsta(java.lang.String vrsta)
   {
      this.vrsta = vrsta;
   }

   public java.lang.String getModel()
   {
      return this.model;
   }

   public void setModel(java.lang.String model)
   {
      this.model = model;
   }

   public java.lang.String getMotor()
   {
      return this.motor;
   }

   public void setMotor(java.lang.String motor)
   {
      this.motor = motor;
   }

   public java.lang.String getOprema()
   {
      return this.oprema;
   }

   public void setOprema(java.lang.String oprema)
   {
      this.oprema = oprema;
   }

   public java.lang.String getDodatnaOprema()
   {
      return this.dodatnaOprema;
   }

   public void setDodatnaOprema(java.lang.String dodatnaOprema)
   {
      this.dodatnaOprema = dodatnaOprema;
   }

   public java.lang.String getVIN()
   {
      return this.VIN;
   }

   public void setVIN(java.lang.String VIN)
   {
      this.VIN = VIN;
   }

   public Vozilo(java.lang.Long voziloID, java.lang.String vrsta,
         java.lang.String model, java.lang.String motor,
         java.lang.String oprema, java.lang.String dodatnaOprema,
         java.lang.String VIN)
   {
      this.voziloID = voziloID;
      this.vrsta = vrsta;
      this.model = model;
      this.motor = motor;
      this.oprema = oprema;
      this.dodatnaOprema = dodatnaOprema;
      this.VIN = VIN;
   }

}