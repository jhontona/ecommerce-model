



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class Product
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToOne 
	protected Invoice invoice;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToOne(mappedBy = "product") 
	protected ShoppingCart shoppingCart;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToOne(mappedBy = "product") 
	protected Stock stock;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Id 
	@javax.persistence.Column(nullable = false) 
	protected final Long id = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Product(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetInvoice(Invoice myInvoice) {
		if (this.invoice != myInvoice) {
			if (myInvoice != null){
				if (this.invoice != myInvoice) {
					Invoice oldinvoice = this.invoice;
					this.invoice = myInvoice;
					if (oldinvoice != null)
						oldinvoice.unsetProduct();
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetShoppingCart(ShoppingCart myShoppingCart) {
		if (this.shoppingCart != myShoppingCart) {
			if (myShoppingCart != null){
				if (this.shoppingCart != myShoppingCart) {
					ShoppingCart oldshoppingCart = this.shoppingCart;
					this.shoppingCart = myShoppingCart;
					if (oldshoppingCart != null)
						oldshoppingCart.unsetProduct();
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetStock(Stock myStock) {
		if (this.stock != myStock) {
			if (myStock != null){
				if (this.stock != myStock) {
					Stock oldstock = this.stock;
					this.stock = myStock;
					if (oldstock != null)
						oldstock.unsetProduct();
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Invoice getInvoice() {
		return this.invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public ShoppingCart getShoppingCart() {
		return this.shoppingCart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Stock getStock() {
		return this.stock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setName(String myName) {
		this.name = myName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setInvoice(Invoice myInvoice) {
		this.basicSetInvoice(myInvoice);
		myInvoice.basicSetProduct(this);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setShoppingCart(ShoppingCart myShoppingCart) {
		this.basicSetShoppingCart(myShoppingCart);
		myShoppingCart.basicSetProduct(this);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setStock(Stock myStock) {
		this.basicSetStock(myStock);
		myStock.basicSetProduct(this);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetName() {
		this.name = "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetInvoice() {
		if (this.invoice == null)
			return;
		Invoice oldinvoice = this.invoice;
		this.invoice = null;
		oldinvoice.unsetProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetShoppingCart() {
		if (this.shoppingCart == null)
			return;
		ShoppingCart oldshoppingCart = this.shoppingCart;
		this.shoppingCart = null;
		oldshoppingCart.unsetProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetStock() {
		if (this.stock == null)
			return;
		Stock oldstock = this.stock;
		this.stock = null;
		oldstock.unsetProduct();
	}

}

