package algorithm.practice;

/**
 * User: 20160301301
 * Date: 2017/11/24 9:18
 * Comment:输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class RandomNode {
    public RandomListNode clone(RandomListNode pHead) {
        if (pHead == null) {
            return pHead;
        }
        cloneNodes(pHead);
        cloneRandom(pHead);
        return reconnectNodes(pHead);
    }

    /**
     * 复制每个节点，连接到自己的后一个上
     */
    void cloneNodes(RandomListNode pHead) {
        RandomListNode pNode = pHead;
        while (pNode != null) {
            RandomListNode pCloned = new RandomListNode(pNode.label);
            pCloned.next = pNode.next;
            pCloned.random = null;

            pNode.next = pCloned;

            pNode = pCloned.next;
        }
    }

    /**
     * 拷贝随机节点
     */
    void cloneRandom(RandomListNode pHead) {
        RandomListNode pNode = pHead;
        while (pNode != null) {
            RandomListNode pCloned = pNode.next;
            if (pNode.random != null) {
                pCloned.random = pNode.random.next;
            }
            pNode = pCloned.next;
        }
    }

    /**
     * 重新连接节点
     */
    RandomListNode reconnectNodes(RandomListNode pHead) {
        RandomListNode pNode = pHead;
        RandomListNode pClonedHead = null;
        RandomListNode pClonedNode = null;
        if (pNode != null) {
            pClonedHead = pNode.next;
            pClonedNode = pClonedHead;

            pNode.next = pClonedNode.next;
            pNode = pNode.next;
        }
        while (pNode != null) {
            pClonedNode.next = pNode.next;
            pClonedNode = pClonedNode.next;
            pNode.next = pClonedNode.next;
            pNode = pNode.next;
        }
        return pClonedHead;
    }

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
}

