package tree;

/**
 * 
 * 
 * findClosestValueInBst
 * 
 * @author eaukjam
 *
 */
public class BSTClosestValue {
	public static int findClosestValueInBst(BST tree, int target) {
		BST root = tree;
		int diff = Integer.MAX_VALUE;
		int value = 0;
		while (tree != null) {
			if (tree.value == target) {
				return target;
			}
			if (tree.value < target) {
				if (diff > Math.abs(tree.value - target)) {
					diff = Math.abs(tree.value - target);
					value = tree.value;
				}
				tree = tree.right;
			} else if (tree.value > target) {
				if (diff > Math.abs(tree.value - target)) {
					diff = Math.abs(tree.value - target);
					value = tree.value;
				}
				tree = tree.left;
			}
		}

		return value;
	}

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {

		BSTClosestValue.BST root1 = new BST(10);
		root1.left = new BST(5);
		root1.left.left = new BST(2);
		root1.left.left.left = new BST(1);
		root1.left.right = new BST(5);
		root1.right = new BST(15);
		root1.right.left = new BST(13);
		root1.right.left.right = new BST(14);
		root1.right.right = new BST(22);

		BSTClosestValue.BST root2 = new BST(502);
		root2.left = new BST(204);
		root2.left.left = new BST(203);
		root2.left.right = new BST(205);
		root2.right = new BST(55000);
		root2.right.left = new BST(1001);
		root2.right.left.right = new BST(4500);

		System.out.println(findClosestValueInBst(root2, 4501));

	}
}
