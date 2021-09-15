/**
 * Created by magbanua-ariel on 14/01/2016.
 */
public class Car {
    // car types
    public static final String SPORTS_UTILITY_VEHICLE = "SUV";
    public static final String LUXURY_VEHICLE = "LV";
    public static final String SPORTS = "Sports";
    public static final String ROADSTER = "Roadster";

    // car body configurations
    public static final String HATCHBACK = "Hatchback";
    public static final String CONVERTIBLE = "Convertible";
    public static final String FAMILY = "Family";
    public static final String MINI_VAN = "Minivan";
    public static final String VAN = "Van";
    public static final String PICK_UP = "Pickup";

    // rent car status
    public static final String STATUS_AVAILABLE = "available";
    public static final String SOLD = "sold";

    // attributes
    private int id = -1;
    private String name = "";
    private String type = "";
    private String body = "";
    private String manufacturer = "";
    private String engineName = "";
    private String fuelType = "";
    private int horsePower = 0;
    private String wheelDiameter = "";
    private String wheelThickness = "";
    private int numberOfSeats = 1;
    private double weightLimit = 0;
    private String status = "";

    public Car(
        int id,
        String name,
        String type,
        String body,
        String manufacturer,
        String engineName,
        String fuelType,
        int horsePower,
        String wheelDiameter,
        String wheelThickness,
        int numberOfSeats,
        double weightLimit,
        String status
    ) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.body = body;
        this.manufacturer = manufacturer;
        this.engineName = engineName;
        this.fuelType = fuelType;
        this.horsePower = horsePower;
        this.wheelDiameter = wheelDiameter;
        this.wheelThickness = wheelThickness;
        this.numberOfSeats = numberOfSeats;
        this.weightLimit = weightLimit;
        this.status = status;
    }

    public Car(
        String name,
        String type,
        String body,
        String manufacturer,
        String engineName,
        String fuelType,
        int horsePower,
        String wheelDiameter,
        String wheelThickness,
        int numberOfSeats,
        double weightLimit,
        String status
    ) {
        this.name = name;
        this.type = type;
        this.body = body;
        this.manufacturer = manufacturer;
        this.engineName = engineName;
        this.fuelType = fuelType;
        this.horsePower = horsePower;
        this.wheelDiameter = wheelDiameter;
        this.wheelThickness = wheelThickness;
        this.numberOfSeats = numberOfSeats;
        this.weightLimit = weightLimit;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(String wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public String getWheelThickness() {
        return wheelThickness;
    }

    public void setWheelThickness(String wheelThickness) {
        this.wheelThickness = wheelThickness;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class SpecificationsBuilder {
        private int id = -1;
        private String name = "";
        private String type = "";
        private String body = "";
        private String manufacturer = "";
        private String engineName = "";
        private String fuelType = "";
        private int horsePower = 0;
        private String wheelDiameter = "";
        private String wheelThickness = "";
        private int numberOfSeats = 1;
        private double weightLimit = 0;
        private String status = "";

        public SpecificationsBuilder(
            String name,
            String type,
            String manufacturer
        ) {
            this.name = name;
            this.type = type;
            this.manufacturer = manufacturer;
        }

        public SpecificationsBuilder(
            String name,
            String type,
            String manufacturer,
            String engineName,
            String fuelType,
            int horsePower
        ) {
            this.name = name;
            this.type = type;
            this.manufacturer = manufacturer;
            this.engineName = engineName;
            this.fuelType = fuelType;
            this.horsePower = horsePower;
        }

        public SpecificationsBuilder(
            String name,
            String type,
            String body,
            String manufacturer,
            String engineName,
            String fuelType,
            int horsePower,
            String wheelDiameter,
            String wheelThickness,
            int numberOfSeats,
            double weightLimit,
            String status
        ) {
            this.name = name;
            this.type = type;
            this.body = body;
            this.manufacturer = manufacturer;
            this.engineName = engineName;
            this.fuelType = fuelType;
            this.horsePower = horsePower;
            this.wheelDiameter = wheelDiameter;
            this.wheelThickness = wheelThickness;
            this.numberOfSeats = numberOfSeats;
            this.weightLimit = weightLimit;
            this.status = status;
        }

        public SpecificationsBuilder(
            int id,
            String name,
            String type,
            String body,
            String manufacturer,
            String engineName,
            String fuelType,
            int horsePower,
            String wheelDiameter,
            String wheelThickness,
            int numberOfSeats,
            double weightLimit,
            String status
        ) {
            this.id = id;
            this.name = name;
            this.type = type;
            this.body = body;
            this.manufacturer = manufacturer;
            this.engineName = engineName;
            this.fuelType = fuelType;
            this.horsePower = horsePower;
            this.wheelDiameter = wheelDiameter;
            this.wheelThickness = wheelThickness;
            this.numberOfSeats = numberOfSeats;
            this.weightLimit = weightLimit;
            this.status = status;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getEngineName() {
            return engineName;
        }

        public void setEngineName(String engineName) {
            this.engineName = engineName;
        }

        public String getFuelType() {
            return fuelType;
        }

        public void setFuelType(String fuelType) {
            this.fuelType = fuelType;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        public String getWheelDiameter() {
            return wheelDiameter;
        }

        public void setWheelDiameter(String wheelDiameter) {
            this.wheelDiameter = wheelDiameter;
        }

        public String getWheelThickness() {
            return wheelThickness;
        }

        public void setWheelThickness(String wheelThickness) {
            this.wheelThickness = wheelThickness;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public void setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }

        public double getWeightLimit() {
            return weightLimit;
        }

        public void setWeightLimit(double weightLimit) {
            this.weightLimit = weightLimit;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public Car build() {
            if (this.id>0) {
                return new Car(
                    this.id,
                    this.name,
                    this.type,
                    this.body,
                    this.manufacturer,
                    this.engineName,
                    this.fuelType,
                    this.horsePower,
                    this.wheelDiameter,
                    this.wheelThickness,
                    this.numberOfSeats,
                    this.weightLimit,
                    this.status
                );
            } else {
                return new Car(
                    this.name,
                    this.type,
                    this.body,
                    this.manufacturer,
                    this.engineName,
                    this.fuelType,
                    this.horsePower,
                    this.wheelDiameter,
                    this.wheelThickness,
                    this.numberOfSeats,
                    this.weightLimit,
                    this.status
                );
            }
        }
    }
}
