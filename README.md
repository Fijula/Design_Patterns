b) Builder - construct complex objects step-by-step in a controlled and flexible manner. It separates the object construction process from its representation.
           Use Case -
           1)database configuration class-construct complex, immutable DatabaseConfiguration objects step-by-step using a dedicated DatabaseConfigurationBuilder class.
           2)Building Queries-To build complex, error-resistant SQL queries, use the Builder pattern with a QueryBuilder to define SELECT, FROM, WHERE, etc. clauses step-by-step, resulting in a final Query object.
           3)Messaging Services- dedicated MessageBuilder class, can construct messages step-by-step (text, image, audio, video) with optional settings, promoting error-resistant and immutable message objects.

           Implementation - create a Builder object,l methods on the Builder to set the desired properties of the product, call a build() method on the Builder to create the final product object.
