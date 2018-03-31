package beat.mercy.entity;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.MapKeyColumn;

@Entity
public class SaleItemsOrder extends Order {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1758860824618293346L;
	
	private Map<SaleItem,Integer> saleItems;
	
	@ElementCollection(fetch=FetchType.LAZY)
    @CollectionTable(name = "order_sale_item_map_amount")
	@MapKeyColumn(name = "order_sale_item")
	public Map<SaleItem, Integer> getSaleItems() {
		return saleItems;
	}

	public void setSaleItems(Map<SaleItem, Integer> saleItems) {
		this.saleItems = saleItems;
	}
	

}
