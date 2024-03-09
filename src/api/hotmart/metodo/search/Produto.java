package api.hotmart.metodo.search;

public class Produto {

	private String name;
	private String producerName;
	private float temperature;
	private float reviewRating;
	private float blueprint;
	private String locale;
	private ProductPrice price;
	private ProductTags productTags;
	private Affiliation affiliation;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the producerName
	 */
	public String getProducerName() {
		return producerName;
	}

	/**
	 * @param producerName the producerName to set
	 */
	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the reviewRating
	 */
	public float getReviewRating() {
		return reviewRating;
	}

	/**
	 * @param reviewRating the reviewRating to set
	 */
	public void setReviewRating(float reviewRating) {
		this.reviewRating = reviewRating;
	}

	/**
	 * @return the blueprint
	 */
	public float getBlueprint() {
		return blueprint;
	}

	/**
	 * @param blueprint the blueprint to set
	 */
	public void setBlueprint(float blueprint) {
		this.blueprint = blueprint;
	}

	/**
	 * @return the locale
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * @param locale the locale to set
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * @return the price
	 */
	public ProductPrice getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(ProductPrice price) {
		this.price = price;
	}

	/**
	 * @return the productTags
	 */
	public ProductTags getProductTags() {
		return productTags;
	}

	/**
	 * @param productTags the productTags to set
	 */
	public void setProductTags(ProductTags productTags) {
		this.productTags = productTags;
	}

	/**
	 * @return the affiliation
	 */
	public Affiliation getAffiliation() {
		return affiliation;
	}

	/**
	 * @param affiliation the affiliation to set
	 */
	public void setAffiliation(Affiliation affiliation) {
		this.affiliation = affiliation;
	}

	public class ProductPrice{
		private float value;
		private String currency;
		/**
		 * @return the value
		 */
		public float getValue() {
			return value;
		}
		/**
		 * @param value the value to set
		 */
		public void setValue(float value) {
			this.value = value;
		}
		/**
		 * @return the currency
		 */
		public String getCurrency() {
			return currency;
		}
		/**
		 * @param currency the currency to set
		 */
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		
	}
	
	public class ProductTags{
		
		AffiliationRule affiliationRule;
        boolean hasAffiliationResource;
        boolean bohasAlternativePage;
        boolean hasHotleads;
        AffiliationType affiliationType;
        boolean affiliationCookieDuration;
        boolean hasGlobalAffiliation;
		/**
		 * @return the affiliationRule
		 */
		public AffiliationRule getAffiliationRule() {
			return affiliationRule;
		}
		/**
		 * @param affiliationRule the affiliationRule to set
		 */
		public void setAffiliationRule(AffiliationRule affiliationRule) {
			this.affiliationRule = affiliationRule;
		}
		/**
		 * @return the hasAffiliationResource
		 */
		public boolean isHasAffiliationResource() {
			return hasAffiliationResource;
		}
		/**
		 * @param hasAffiliationResource the hasAffiliationResource to set
		 */
		public void setHasAffiliationResource(boolean hasAffiliationResource) {
			this.hasAffiliationResource = hasAffiliationResource;
		}
		/**
		 * @return the bohasAlternativePage
		 */
		public boolean isBohasAlternativePage() {
			return bohasAlternativePage;
		}
		/**
		 * @param bohasAlternativePage the bohasAlternativePage to set
		 */
		public void setBohasAlternativePage(boolean bohasAlternativePage) {
			this.bohasAlternativePage = bohasAlternativePage;
		}
		/**
		 * @return the hasHotleads
		 */
		public boolean isHasHotleads() {
			return hasHotleads;
		}
		/**
		 * @param hasHotleads the hasHotleads to set
		 */
		public void setHasHotleads(boolean hasHotleads) {
			this.hasHotleads = hasHotleads;
		}
		/**
		 * @return the affiliationType
		 */
		public AffiliationType getAffiliationType() {
			return affiliationType;
		}
		/**
		 * @param affiliationType the affiliationType to set
		 */
		public void setAffiliationType(AffiliationType affiliationType) {
			this.affiliationType = affiliationType;
		}
		/**
		 * @return the affiliationCookieDuration
		 */
		public boolean isAffiliationCookieDuration() {
			return affiliationCookieDuration;
		}
		/**
		 * @param affiliationCookieDuration the affiliationCookieDuration to set
		 */
		public void setAffiliationCookieDuration(boolean affiliationCookieDuration) {
			this.affiliationCookieDuration = affiliationCookieDuration;
		}
		/**
		 * @return the hasGlobalAffiliation
		 */
		public boolean isHasGlobalAffiliation() {
			return hasGlobalAffiliation;
		}
		/**
		 * @param hasGlobalAffiliation the hasGlobalAffiliation to set
		 */
		public void setHasGlobalAffiliation(boolean hasGlobalAffiliation) {
			this.hasGlobalAffiliation = hasGlobalAffiliation;
		}
        
    }
	
	public enum AffiliationType{
		APPLICATION,
		ANYONE;
	}
	
	public enum AffiliationRule{
		LAST_COOKIE_COUNTS;
	}

}
