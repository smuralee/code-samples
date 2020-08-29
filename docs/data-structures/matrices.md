1. Flip matrix horizontally
    * Examples
        * For an array row [1,2,3] - The flip will be 1 to 3, 3 to 1 and 2 is static
        * For and array row [1,2,3,4] - The flip is 1 to 4, 4 -1 and 2 to 3, 3 to 2
        * For and array row [1,2,3,4,5] - The flip is 1 to 5, 5 -1 ; 2 to 4, 4 to 2 and 3 is static
    * **Number of flips = row length/2**
        * For even number of elements - all numbers flip
        * For odd number of elements - centre is untouched and others flip
    * The loop on the row will be **(int i = 1; i <= row.length / 2; i++)**
    * Initializing with i=1 since we need the index as, row.length -1
