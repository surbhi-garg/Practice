package furniture;

/*This class is made so that even if new material of chair or table comes in picture
* ,We don't need to create a concrete class for each type,
* We just need to define the material and it's behavior under stress and fire and the code will run for
* that type too.
*
* */

public class Material {
   private String materialName;
   private String behaviorFire;
   private String behaviorStress;

    public Material(String materialName, String behaviorFire, String behaviorStress) {
        this.materialName = materialName;
        this.behaviorFire = behaviorFire;
        this.behaviorStress = behaviorStress;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getBehaviorFire() {
        return behaviorFire;
    }

    public void setBehaviorFire(String behaviorFire) {
        this.behaviorFire = behaviorFire;
    }

    public String getBehaviorStress() {
        return behaviorStress;
    }

    public void setBehaviorStress(String behaviorStress) {
        this.behaviorStress = behaviorStress;
    }
}
