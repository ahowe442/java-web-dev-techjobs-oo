package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private static final String DEFAULT_MESSAGE = "No Data Available";
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


//    @Override
//    public String toString() {
//
//        return String.format("ID:  %s\nName: %s\nEmployer: %s\nLocation: %s\nPosition Type: %s\nCore Competency: %s\n",
//                name == null ? DEFAULT_MESSAGE : name,
//                employer == null ? DEFAULT_MESSAGE : employer,
//                location == null ? DEFAULT_MESSAGE : location,
//                positionType == null ? DEFAULT_MESSAGE : positionType,
//                coreCompetency == null ? DEFAULT_MESSAGE : coreCompetency);
//
//    }
//}
//    @Override
//    public String toString() {
//
//        return String.format("\n" +
//                "ID: " + id +
//                "\nName: " + name +
//                "\nEmployer: " + employer +
//                "\nLocation: " + location +
//                "\nPositionType: " + positionType.getValue() +
//                "\nCoreCompetency: " + coreCompetency +
//                "\n",
//                name == null ? DEFAULT_MESSAGE : name,
//                employer == null ? DEFAULT_MESSAGE : employer,
//                location == null ? DEFAULT_MESSAGE : location,
//                positionType == null ? DEFAULT_MESSAGE : positionType,
//                coreCompetency == null ? DEFAULT_MESSAGE : coreCompetency);
//
//        }
//    }


    //TODO: get help with this method.  Why will it not let me create a loop.
    // if the field is null then I need to return only that portion of the field with
    // a "Data not available" message.


    @Override
    public String toString() {
        boolean nullName = (String.valueOf(name) == null || String.valueOf(name) == "null" || String.valueOf(name) == "");
        boolean nullEmp = (String.valueOf(employer) == null || String.valueOf(employer) == "null" || String.valueOf(employer) == "");
        boolean nullLocate = (String.valueOf(location) == null || String.valueOf(location) == "null" || String.valueOf(location) == "");
        boolean nullPoTy = (String.valueOf(positionType) == null || String.valueOf(positionType) == "null" || String.valueOf(positionType) == "");
        boolean nullCorComp = (String.valueOf(coreCompetency) == null || String.valueOf(coreCompetency) == "null" || String.valueOf(coreCompetency) == "");

        String noData = "No data available";

//        String nameS = name.toString();
//        String employerS = employer.toString();
//        String locationS = location.toString();
//        String positionTypeS = positionType.toString();
//        String coreCompetencyS = coreCompetency.toString();

        for (Job job : jobs) {
            if (!nullName) {
                noData = String.valueOf(name);
            }
            if (!nullEmp) {
                noData = String.valueOf(employer);
            }
            if (!nullLocate) {
                noData = String.valueOf(location);
            }
            if (!nullPoTy) {
                noData = String.valueOf(positionType);
            }
            if (!nullCorComp) {
                noData = String.valueOf(coreCompetency);
            } else {
                return "\n" +
                        "ID:  " + id +
                        "\nName: " + name +
                        "\nEmployer: " + employer +
                        "\nLocation: " + location +
                        "\nPositionType: " + positionType +
                        "\nCoreCompetency: " + coreCompetency +
                        "\n";
            }
        }
        return job;
    }
}



