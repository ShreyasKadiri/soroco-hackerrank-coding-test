def cmap(funcs,arr):
    for func in funcs:
        arr = list(map(func,arr)) 
    return arr 


if _name_ == '_main_':
    print(cmap([lambda x:x*x, lambda x:x+x],[1,2,3,4]))
