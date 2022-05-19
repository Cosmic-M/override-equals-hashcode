import java.util.Objects;

public class Rectangle {
  private Integer width;
  private Integer length;
  private String color;

  public Rectangle(Integer width, Integer length, String color) {
    this.width = width;
    this.length = length;
    this.color = color;
  }

  @Override
  public boolean equals(Object object) {
    if (object == null) {
      return false;
    }
    if (this == object) {
      return true;
    }
    if (this.getClass().equals(object.getClass())) {
      Rectangle rectangle = (Rectangle) object;
      return  Objects.equals(this.width, rectangle.width) && Objects.equals(this.length, rectangle.length)
              && Objects.equals(this.color, rectangle.color);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = 17;
    hash = 31 * hash + ((width == null) ? 0 : width.hashCode());
    hash = 31 * hash + ((length == null) ? 0 : length.hashCode());
    hash = 31 * hash + ((color == null) ? 0 : color.hashCode());
    return hash;
  }

  public Integer getWidth() {
    return width;
  }

  public Integer getLength() {
    return length;
  }

  public String getColor() {
    return color;
  }
}