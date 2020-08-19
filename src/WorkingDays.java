public enum WorkingDays {
    Monday (40), Tuesday (32), Wednesday (24), Thursday(16),
    Friday(8), Saturday (0), Sunday (0);

    private int workingHours;

    WorkingDays(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }


}
