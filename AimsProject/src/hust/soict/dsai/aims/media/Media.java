package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
    protected  static int nbMedia = 0;
    protected  int id;
    protected String title;
    protected String category;
    protected float cost;
     public Media() {
        nbMedia++;
        this.id = nbMedia;
    }

    public Media(String title) {
        this();
        this.title = title;
    }

    public Media(String title, String category, float cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Media) {
            try {
                return ((Media) o).getTitle().equals(this.title);
            } catch (NullPointerException e) {
                return false;
            }
        }
        return false;
    }

    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }
    public static final Comparator<Media> COMPARE_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_COST_TITLE = new MediaComparatorByCostTitle();
};
