class Product(object):
    def __init__(self):
        self.name = ""
        
        self.invoice = None
        self.shoppingCart = None
        self.stock = None
        
    # Start of user code -> properties/constructors for Product class

    # End of user code
    # Start of user code -> methods for Product class

    # End of user code



class Invoice(object):
    def __init__(self):
        self.number = ""
        
        self.product = None
        self.customer = None
        
    # Start of user code -> properties/constructors for Invoice class

    # End of user code
    # Start of user code -> methods for Invoice class

    # End of user code


class Stock(object):
    def __init__(self):
        self.name = ""
        self.address = ""
        
        self.product = None
        
    # Start of user code -> properties/constructors for Stock class

    # End of user code
    # Start of user code -> methods for Stock class

    # End of user code

class ShoppingCart(object):
    def __init__(self):
        self.date = ""
        
        self.product = None
        self.customer = None
        
    # Start of user code -> properties/constructors for ShoppingCart class

    # End of user code
    # Start of user code -> methods for ShoppingCart class

    # End of user code


class Customer(object):
    def __init__(self):
        self.name = ""
        self.email = ""
        self.__id = ""
        
        self.invoice = None
        self.shoppingCart = None
        
    # Start of user code -> properties/constructors for Customer class

    # End of user code
    # Start of user code -> methods for Customer class

    # End of user code


class Provider(Product):
    def __init__(self):
        self.name = ""
        
        
    # Start of user code -> properties/constructors for Provider class

    # End of user code
    # Start of user code -> methods for Provider class

    # End of user code

class Category(Product):
    def __init__(self):
        self.name = ""
        
        
    # Start of user code -> properties/constructors for Category class

    # End of user code
    # Start of user code -> methods for Category class

    # End of user code


# Start of user code -> functions/methods for model package

# End of user code
