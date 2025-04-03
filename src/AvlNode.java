public class AvlNode<T> {
	private T value;
	private AvlNode<T> left;
	private AvlNode<T> right;
	protected int ef;

	public AvlNode(T value) {
		left = null;
		this.value = value;
		right = null;
		ef = 0;
	}

	public AvlNode(AvlNode<T> leftBranch, T value, AvlNode<T> rightBranch) {
		left = leftBranch;
		this.value = value;
		right = rightBranch;
		ef = 0;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public AvlNode<T> getLeft() {
		return left;
	}

	public void setLeft(AvlNode<T> left) {
		this.left = left;
	}

	public AvlNode<T> getRight() {
		return right;
	}

	public void setRight(AvlNode<T> right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "[value=" + value + ", ef=" + ef + "]";
	}
}