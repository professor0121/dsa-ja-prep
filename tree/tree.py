class Node:
    def __init__(self ,data):
        self.data=data
        self.right=None
        self.left=None
class Tree:
    def __init__(self):
        self.root=None
    
    def insertNode(self , data):
        newNode=Node(data)
        if (self.root==None):
            self.root=newNode
            return
        currentNode=self.root
        parent=None
        while(currentNode is not None):
            parent=currentNode
            if(data < currentNode.data):
                currentNode=currentNode.left
            else:
                currentNode=currentNode.right
            
        if(data<parent.data):
            parent.left=newNode
        else:
            parent.right=newNode
    def inOrder(self,node):
        if(node is not None):
            self.inOrder(node.left)
            print(node.data)
            self.inOrder(node.right)
tree=Tree()
tree.insertNode(4)
tree.insertNode(5)
tree.insertNode(6)
tree.insertNode(7)
tree.inOrder(tree.root)