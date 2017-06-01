package fr.formation.cocktailbar.entity;

import java.io.Serializable;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

public class Cocktail implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id_cocktail;

	@NotEmpty
	private String name;

	@Min(value = 0, message = "erreur min")
	private Float price;

	private String description;
	
	private Boolean withAlcohol;
	
	private Integer quantity;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_cocktail == null) ? 0 : id_cocktail.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Cocktail)) {
			return false;
		}
		Cocktail other = (Cocktail) obj;
		if (id_cocktail == null) {
			if (other.id_cocktail != null) {
				return false;
			}
		} else if (!id_cocktail.equals(other.id_cocktail)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id_cocktail;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @return the withAlcohol
	 */
	public Boolean getWithAlcohol() {
		return withAlcohol;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id_cocktail = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * @param withAlcohol
	 *            the withAlcohol to set
	 */
	public void setWithAlcohol(Boolean withAlcohol) {
		this.withAlcohol = withAlcohol;
	}

	/**
	 * Affichage d'un cocktail en chaine de caractères.
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("{");
		sb.append(" id=").append(this.id_cocktail != null ? this.id_cocktail : "null");
		sb.append(", name=").append(this.name != null ? this.name : "null");
		sb.append(", price=").append(this.price != null ? this.price : "null");
		sb.append(", withAlcohol=").append(this.withAlcohol != null ? this.withAlcohol : "null");
		sb.append(" }");
		return sb.toString();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
