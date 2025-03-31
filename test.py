class node:
    def __init__(self, data):
        self.data = data
        self.next = next
    
    class SLL:
        def __init__(self):
            self.head = None
            l = SLL()
            n1 = node(10)
            self.head=n1
            n2=node(20)
            n1.next = n2
            n3 = node(30)
            
