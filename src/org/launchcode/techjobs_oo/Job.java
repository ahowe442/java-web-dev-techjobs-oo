package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
//    private Job

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Data not available");
        }
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        if (employer == null) {
            throw new IllegalArgumentException("Data not available");
        }
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        if (location == null) {
            throw new IllegalArgumentException("Data not available");
        }
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        if (positionType == null) {
            throw new IllegalArgumentException("Data not available");
        }
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        if (coreCompetency == null) {
            throw new IllegalArgumentException("Data not available");
        }
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        return "\n" +
                "ID:  " + this.id +
                "\nName: " + this.name +
                "\nEmployer: " + this.employer +
                "\nLocation: " + this.location +
                "\nPositionType: " + this.positionType +
                "\nCoreCompetency: " + this.coreCompetency +
                "\n";
    }
}

    //TODO: get help with this method.  Why will it not let me create a loop.
    // if the field is null then I need to return only that portion of the field with
    // a "Data not available" message.




//    @Override
//    public String toString() {
////        for (String field : fields)
////            if (field != null) {
//        return "\n" +
//                "ID:  " + this.id +
//                "\nName: " + this.name +
//                "\nEmployer: " + this.employer +
//                "\nLocation: " + this.location +
//                "\nPositionType: " + this.positionType +
//                "\nCoreCompetency: " + this.coreCompetency +
//                "\n";
//    }
//}
//            } else (field == null){
//                return "Data not available";
//            }
//        return String.valueOf(this.getClass());
//    }
//}

        //    @Override
//    public String toString() {
//        return "ID:  " + id +
//                "\nName: " + name +
//                "\nEmployer: " + employer +
//                "\nLocation: " + location +
//                "\nPositionType: " + positionType +
//                "\nCoreCompetency: " + coreCompetency;
//        if(name==null || employer==null || location==null || positionType==null || coreCompetency==null){
//            null== String ""
//        }
//    }
//}

