package api.hotmart.metodo.search;

public class Affiliation {
	
	int type;
	Comission comission;
	
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the comission
	 */
	public Comission getComission() {
		return comission;
	}

	/**
	 * @param comission the comission to set
	 */
	public void setComission(Comission comission) {
		this.comission = comission;
	}

	public class Comission{
		Price price;
		float percentage;
		
		/**
		 * @return
		 * @see api.hotmart.metodo.search.Affiliation.Price#getValue()
		 */
		public float getValue() {
			return price.getValue();
		}
		/**
		 * @param value
		 * @see api.hotmart.metodo.search.Affiliation.Price#setValue(float)
		 */
		public void setValue(float value) {
			price.setValue(value);
		}
		/**
		 * @return
		 * @see api.hotmart.metodo.search.Affiliation.Price#getCurrency()
		 */
		public String getCurrency() {
			return price.getCurrency();
		}
		/**
		 * @param currency
		 * @see api.hotmart.metodo.search.Affiliation.Price#setCurrency(java.lang.String)
		 */
		public void setCurrency(String currency) {
			price.setCurrency(currency);
		}
		/**
		 * @return
		 * @see java.lang.Object#hashCode()
		 */
		public int hashCode() {
			return price.hashCode();
		}
		/**
		 * @param obj
		 * @return
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		public boolean equals(Object obj) {
			return price.equals(obj);
		}
		/**
		 * @return
		 * @see java.lang.Object#toString()
		 */
		public String toString() {
			return price.toString();
		}
		public Price getPrice() {
			return price;
		}
		public void setPrice(Price price) {
			this.price = price;
		}
		public float getPercentage() {
			return percentage;
		}
		public void setPercentage(float percentage) {
			this.percentage = percentage;
		}
		
	}
	
	public class Price{
		float value;
		String currency;
		
		public float getValue() {
			return value;
		}
		public void setValue(float value) {
			this.value = value;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		
		
	}
}
