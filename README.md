Workflow:

Define the Component Interface: Create an interface or abstract class with methods for managing child objects (e.g., addDepartment, removeDepartment, printDepartmentName).
Implement Leaf and Composite: Create concrete classes for leaf nodes (e.g., SalesDepartment, FinancialDepartment) and composite nodes (e.g., HeadDepartment) that implement the Component methods. Leaves handle the default behavior, while composites manage child objects.
Build the Structure: Compose objects by creating leaf and composite instances, adding them as children to appropriate composites.


Ex: A big box contains small boxes or items inside
Component- Box or item 
Leaf -item
composite- additem / removeitem / add box /print box

Base Component Department (Interface)
Leaves- Fini,Sales,head(Finc,sales)
Composite- CompositApplication(add/print)