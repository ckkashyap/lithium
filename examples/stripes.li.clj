(mov :ax 0x13)
(int 0x10)
(mov :ax 0xa000)
(mov :es :ax)
(xor :di :di)
(mov :cx 200)
(xor :al :al)
:outer
(push :cx)
(mov :cx 320)
:inner
(stosb)
(inc :al)
(cmp :al 40)
(jne :dontzero)
(xor :al :al)
:dontzero
(loop :inner)
(inc :al)
(cmp :al 40)
(jne :dontzero2)
(xor :al :al)
:dontzero2
(pop :cx)
(loop :outer)
(mov :ah 7)
(int 0x21)
(mov :ax 3)
(int 0x10)
(ret)