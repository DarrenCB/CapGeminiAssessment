Feature: BuyJourney

  Scenario: Select Item from homepage
    Given the user is on the "home" page
    When the user goes to a product
    And user clicks "more"
    Then "product page" is displayed

  Scenario: Add Item to Cart on homepage
    Given the user is on the "home" page
    When user clicks "add to cart"
    Then product has been added to cart

  Scenario: Add Item to Cart on productpage
    Given the user is on the "product" page
    When the user specifies exact purchase
    And user clicks "add to cart on product page"
    Then product has been added to cart

  Scenario: Add Message to Previous Order
    Given the user is on the "sign in" page
    And the user signs in with "BuyJourney" email
    When user fills out "message form on details page"
    Then message is sent off

  Scenario: Filters Display Correct Products
    Given the user is on the "dresses" page
    When user clicks "filters"
    Then "correct product" is displayed

  Scenario: Clear Filters Restores Products
    Given the user is on the "dresses" page
    And user clicks "filters"
    When  user clicks "clear filters"
    Then "all products" is displayed

  Scenario: Subscribe to Newsletter
    Given the user is on the "home" page
    When user fills out "newsletter form"
    Then "success message" is displayed

  Scenario: Send Message Through Contact Us Page
    Given the user is on the "sign in" page
    And the user signs in with "BuyJourney" email
    When user fills out "contact us form"
    Then "contact confirmation message" is displayed

  Scenario: Buy Summer Dress via Menu
    Given the user is on the "summer dresses" page
    When the user adds product to cart
    Then product has been added to cart

  Scenario: Add Item via Search
    Given the user is on the "home" page
    When the user searches for product
    And the user adds product to cart
    Then product has been added to cart

  Scenario: Buy Second Item
    Given the user is on the "home" page
    And the user adds product to cart
    When the user continues and buys another item
    Then cart page has both items

  Scenario: Order Large Quantity of Item
    Given the user is on the "home" page
    When user attempts to buy large quantity of product
    Then "out of stock message" is displayed
    And add to cart button is disabled

  Scenario: Product Available in Different Options
    Given the user is on the "home" page
    When user selects product with different options
    Then "product available with different options message" is displayed

  Scenario: Reorder Product
    Given the user is on the "sign in" page
    And the user signs in with "BuyJourney" email
    When user reorders item
    And user completes purchase
    Then purchase is successful

