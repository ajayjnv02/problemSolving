package tree;

public class ValidateBST {

	/**
	 * Don't format
	 * This will in case 
	 *                            10
	 *                           *   *
	 *                          *      *
	 *                         5         15
	 *                       *   *       * *
	 *                     2       5    13  18
	 *                    *          *       
	 *                   1            11(Will not able to identify this 11 is in wrong sub tree)
	 *               1             
	 * @param tree
	 * @return
	 */
	public static boolean validateBstErrored(BST tree) {

		if (tree.left == null && tree.right == null) {

			return true;
		}
		if (tree.left != null && tree.right != null) {
			System.out.println(tree.left.value + "  " + tree.value + "   " + tree.right.value);
			return tree.value > tree.left.value && validateBstErrored(tree.left) && tree.value <= tree.right.value
					&& validateBstErrored(tree.right);
		}
		if (tree.left != null) {
			System.out.println(tree.left.value + "  " + tree.value);
			return tree.value > tree.left.value && validateBstErrored(tree.left);
		}
		if (tree.right != null) {
			System.out.println("  " + tree.value + "   " + tree.right.value);
			return tree.value <= tree.right.value && validateBstErrored(tree.right);
		}
		System.out.println("no case ");
		return false;
	}

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}
	}
	public static boolean validateBst(BST tree) {
	
		return validateBstRecursive(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	private static boolean validateBstRecursive(BST tree, int minValue, int maxValue) {
		if (tree.value < minValue || tree.value >= maxValue)
			return false;

		if (tree.left != null && !validateBstRecursive(tree, minValue, tree.value)) {
			return false;
		}
		if (tree.right != null && !validateBstRecursive(tree, tree.value, maxValue)) {
			return false;
		}
		return true;

	}
	public static void main(String[] args) {

		ValidateBST.BST root1 = new BST(10);
		root1.left = new BST(5);
		root1.left.left = new BST(2);
		root1.left.left.left = new BST(1);
		root1.left.right = new BST(5);
		root1.right = new BST(15);
		root1.right.left = new BST(13);
		root1.right.left.right = new BST(14);
		root1.right.right = new BST(22);

		ValidateBST.BST root2 = new BST(502);
		root2.left = new BST(204);
		root2.left.left = new BST(203);
		root2.left.right = new BST(205);
		root2.right = new BST(55000);
		root2.right.left = new BST(1001);
		root2.right.left.right = new BST(4500);

		System.out.println(validateBstErrored(root2));

	}
}
