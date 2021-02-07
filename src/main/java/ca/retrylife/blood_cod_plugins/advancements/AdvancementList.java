package ca.retrylife.blood_cod_plugins.advancements;

import org.bukkit.NamespacedKey;

public enum AdvancementList {
    // The root plugin. Not used
    @SuppressWarnings("deprecation")
    ROOT(new NamespacedKey("bcp", "root"), "root"),

    // Enter the church
    @SuppressWarnings("deprecation")
    ENTER_CHURCH(new NamespacedKey("bcp", "enter_church"), "enter_church"),

    // Lightning strike
    @SuppressWarnings("deprecation")
    ENLIGHTENMENT(new NamespacedKey("bcp", "enlightenment"), "enlightenment");

    private final NamespacedKey name;
    private final String fileTitle;

    private AdvancementList(NamespacedKey name, String fileTitle) {
        this.name = name;
        this.fileTitle = fileTitle;
    }

    public NamespacedKey getName() {
        return name;
    }

    public String getFileTitle() {
        return fileTitle;
    }

}