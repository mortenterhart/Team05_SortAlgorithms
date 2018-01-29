public enum Configuration {
    instance;

    public AvailableSortingAlgorithms sortingType = AvailableSortingAlgorithms.bucketsort;

    public String userDirectory = System.getProperty("user.dir");
    public String fileSeparator = System.getProperty("file.separator");
    // [userDirectory]/[sortingType]/jar/[sortingType].jar
    // e.g. ../bucketsort/jar/bucketsort.jar
    public String pathToJar = userDirectory + fileSeparator + sortingType.name() +
            fileSeparator + "jar" + fileSeparator + sortingType.name() + ".jar";

    public String propertiesFile = "sorting.properties";
    public String sortingProperties = userDirectory + fileSeparator + propertiesFile;

    public void setSortingType(AvailableSortingAlgorithms type) {
        sortingType = type;
    }
}